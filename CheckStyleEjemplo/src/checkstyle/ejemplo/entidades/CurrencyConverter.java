package checkstyle.ejemplo.entidades;

import checkstyle.ejemplo.enums.Currency;
import java.math.*;
import java.net.Authenticator.RequestorType;

public class CurrencyConverter {
    
    private int Rate;
    
    public CurrencyConverter() { this.Rate = 10; }
    
    public static BigDecimal Convert(Currency from, Currency TO, String amount, String veryLongUnusedParameterThatYouShouldDelete) {
        
        String SomeVariable;
        
        if (true) {
            
        } 
        
        if (false) {}
        
        long a = 0; String b;
        
        switch (from) {
            case USD:
                try {
                    a = Integer.parseInt("10");
                } catch (Exception ex) {
                    
                }
                break;
            case UYU:
                a = 20L;
        }
        
        int magic = 35;
        
            a = a * magic;
        
        return new BigDecimal(a);
        
    }

}