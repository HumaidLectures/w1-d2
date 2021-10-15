fun main() {
    /* requirements:
    write a program that has two variables , first one is health points which is numeric value , the second one is isHealing which is a logical value
     which will check if the healthPoints is lower than 30 and isHealing is true, to print your health is awful but you're healing, if isHealing is false print
     you're dying
     if health points is greater than 30, print you're in good health
     */
    val healthPoints = 45
    val isHealing = true
    if (healthPoints <= 30 ){
        if (isHealing) {
            print("your health is awful but you're healing")
        }
        else {
            print("you're dying")
        }
    }
    else
        print("you're in good health")
}
