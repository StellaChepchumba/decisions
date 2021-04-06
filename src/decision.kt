fun main(){
numbers()
    namesArray("stella","aisha","emmaculate")
    server(23)
    server(12)
    server(4)
    server(6)
    digits()
}
fun numbers(){
    for (digits in 1..100)
        if(digits%2==1)
            println(digits)
}
fun namesArray(name1:String,name2:String,name3:String):Array<String>{
    var names= arrayOf(name1,name2,name3)
    for (name in names)
        if(name.length>5) {
            println(name)
}
    return names
}
fun server(age:Int){
    if (age<6){
        println("milk")
    }
    else if (age<15 && age>6){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}
fun digits(){
   for(numbers in 1..100) {
       if (numbers%3==0)
           println("fizz")
   }
    for (numbers in 1..100){
        if (numbers%5==0)
            println("buzz")
    }
    for (numbers in 1..100){
        if (numbers%5==0 && numbers%3==0){
            println("fizzbuzz")
        }
    }
}