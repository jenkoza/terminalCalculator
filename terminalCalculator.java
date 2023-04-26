import java.util.*;



public class terminalCalculator {
    

    /*((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((FUNCTIONS)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))) */

    //DIALOG
    public static void userDialog(){

        System.out.println("\n" + "Please choose one of the following operators to perform a calculation:\n" + "\n" + "+ - * /\n ");

    }

    //ADDITION FUNCTION
    public static int additionCalculator(int num1, int num2){


        int sumAddition = num1 + num2;

        System.out.println("\n" + "Your Answer is:\n" + sumAddition); 

        
        return sumAddition;

        

        
    }

    //SUBTRACTION FUNCTION
    public static int subtractionCalculator (int num3, int num4){

        int sumSubtraction = num3 - num4;

        System.out.println("\n" + "Your Answer is:\n" + sumSubtraction);

        return sumSubtraction;

    }

    //MULTIPLICATION FUNCTION
    public static int multiplicationCalculator(int num5, int num6){

        int sumMultiplication = num5*num6;

        System.out.println("\n" + "Your Answer is:\n" + sumMultiplication);

        return sumMultiplication;
    }

    //DIVISION FUNCTION
    public static int divisionCalculator(int num7, int num8){

        int sumDivision = num7/ num8;

        System.out.println("\n" + "Your Answer is:\n" + sumDivision);
        

        return sumDivision;
        
        
    }


  
                    
                    
                   
                    
                    

                   

                    
        
    

    

    /*((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((MAIN)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))) */
    public static void main(String[] args) {
       
        //INFINITE LOOP
        infiniteloop:
        while(true){

        
        
        //Greeting dialog
        userDialog();
        
        //Receiving and reading input from user
        Scanner readDialog = new Scanner(System.in);
        String receivedInput = readDialog.nextLine();
        
        
        
        //IF INPUT IS + - * /
        if (receivedInput.equals("+")|| receivedInput.equals("-")|| receivedInput.equals("*")|| receivedInput.equals("/")){
            
            
            // Loop for try/catch
           
                
                
                //FIRST NUMBER INPUT
                System.out.println("\n" + "Enter the first number: ");
                Scanner firstNumber = new Scanner(System.in);
                String receivedNumber1 = firstNumber.nextLine();
                    
                    
                    //TRY / CATCH TO CHECK IF THE RECEIVEDNUMBER1 IS AN INTEGER
                    try {
                        Integer.parseInt(receivedNumber1);
                        
                        
                               } catch (Exception e) {
                                System.out.println("\n" + "Your first number was not a valid number." + "\n" );
                                break infiniteloop;
                                
                               }
                    //SPACER
                    System.out.println("");     

         //SECOND NUMBER INPUT
         System.out.println("Enter the second number: " );
         Scanner secondNumber = new Scanner(System.in);
            String receivedNumber2 = secondNumber.nextLine();
     
             // TRY / CATCH TO CHECK IF THE RECEIVEDNUMBER2 IS AN INTEGER
             try {
                        Integer.parseInt(receivedNumber2);
                        

             } catch (Exception e) {
                        System.out.println("\n" +"Your second number was not a valid number." + "\n");
                        
                        
             }

             
              
             //IF INPUT IS +
     if (receivedInput.equals("+")){

             //CALLING ADDITION FUNCTION
             additionCalculator(Integer.valueOf(receivedNumber1),Integer.valueOf(receivedNumber2));
             System.out.println(" ");
   
             
             
             
           
             
            }
             


             
             
            
     
             

              //IF INPUT IS -
     else if (receivedInput.equals("-")){
         
         //CALLING SUBTRACTION FUNCTION
         subtractionCalculator(Integer.valueOf(receivedNumber1),Integer.valueOf(receivedNumber2));
         

             
     }

     //IF INPUT IS *
     else if (receivedInput.equals("*")){

             //CALLING MULTIPLICATION FUNCTION
             multiplicationCalculator(Integer.valueOf(receivedNumber1),Integer.valueOf(receivedNumber2));
             
            }

            //IF INPUT IS /
            else if (receivedInput.equals("/")){
                
                //CALLING DIVISION FUNCTION
                divisionCalculator(Integer.valueOf(receivedNumber1),Integer.valueOf(receivedNumber2));
                
            }
            
            
            //ELSE ERROR
            else{
                
                
                System.out.println("\n" + "Oops. It looks like you've made a mistake.\n" + "\n" );
                
                
                
                
            }
            

                  //(RECEIVING INPUT) ASKING IF USER WOULD LIKE TO TRY AGAIN OR NOT
                  Scanner yesOrNo = new Scanner(System.in);
                  System.out.println("Would you like to try again?\n (y/n) \n");
                  String answerYesOrNo = yesOrNo.next();

            
                  switch(answerYesOrNo){
                    case "Y": System.out.println("\nGreat!");
                    case "y": System.out.println("\nGreat!");
                  break;
                    
                    
                    case "N":System.out.println("\nGoodbye!");
                    case "n": System.out.println("\nGoodbye!");
                    break infiniteloop; 

                    
                    
                  }
                  
            }
            
        }


    }
}

//BREAKING OUT OF INFINITE LOOP


        


    

 






