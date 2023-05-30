public class string {
    public static void main(String [] args){
        String str1 = "www.TIexpert.com";
        int posiçao;
        posiçao = str1.indexOf("TIexpert");
        if(posiçao>=0){
            System.out.println("TIexpert começa na posição " + posiçao);
        }else{
            System.out.println("NÃO HÁ TIEXPERT NA STRING");
        }
        posiçao = str1.indexOf(".com");
        if(posiçao>=0){
            System.out.println("a string começa na posição " + posiçao);
        }else{
            System.out.println("NÃO HÁ .COM NA STRING " + posiçao);
        }
    }
    
}
