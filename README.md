# Samuel-Week1-Money-Changer-Real


**Program for optimal change dispenser**


1. Declare the needed variables 

        `int num;`
        
        `int coin[] = {25, 10, 5, 1};`
        
        25 cents = quater
        
        10 cents = dime
        
        5 cents = nickel
        
        1 cent = penny
        
        
2. Input the change to be dispensed using the Scanner class


3. Divide the value of the standard currency which is represented as _coin array_ (quater, dime, nickel, penny) by the inputed change

      provided `coin [i] <= inputed change`
      
      
4. Get the new change amount by getting the remainder of the No3 above


5. Iterate through to access other lesser values of the standard currency (coin array)

      `change amount -= num * coin[i];` 
