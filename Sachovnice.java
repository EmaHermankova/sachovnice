public class Sachovnice {
    public static void main(String[] args) {
        boolean c = false;
        for(int i =0; i<8 ;i++){
            for(int y=0 ;y<4; y++){
                if(c==false){
                    System.out.print("* ");
                    System.out.print("  ");
                } else {
                    System.out.print("  ");
                    System.out.print("* ");
                }
            }
            if(c==false){
                c=true;
            }else{
                c=false;
            }
            System.out.println();
        }
    }
}
