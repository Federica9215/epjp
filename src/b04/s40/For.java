package b04.s40;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Begin block loop " + i);

            if (i == 2) {
                continue;
            }

            System.out.println("End block loop " + i);
        }

        String[] array =new String[5];
        for (int i =0; i<array.length;i++ ) {
            
        	array[i]="";
    }
         
        for (String item:array) {
        
        	System.out.println(item.length());
    }
    
    }
}
