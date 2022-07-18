//Question 01------------------------------------------
def Area_Of_Disk(r:Double):Double={
  math.Pi * r * r
}
Area_Of_Disk(5)



//Question 02------------------------------------------
def Celsius_To_Fahrenheit(c:Double):Double={
  c * 1.8000 + 32.00
}
Celsius_To_Fahrenheit(35)



//Question 03-------------------------------------------
def Vol_Sphere(r:Double):Double={
  4/3* math.Pi * r * r * r
}
Vol_Sphere(5)



//Question 04--------------------------------------------
def cover_price(copies:Int):Double= 24.95 * copies

def discount(copies:Int):Double= cover_price(copies) * 0.4

def shipping(copies:Int):Double={
  if(copies>50){
    50*3+ 0.75*(copies-50)
  }
  else{
    copies*50
  }
}


def tot_cost(numOfCopies:Int):Double={
  cover_price(numOfCopies) + shipping(numOfCopies) - discount(numOfCopies)

}

tot_cost(60)




//Question 05------------------------------------------------------------------
def easy(x:Int):Int= x*8
def tempo(x:Int):Int= x*7

println("Total Running Time= %d",easy(2)+tempo(3)+easy(2))



