class main{
    public static void run(int x){
        ++x;
        x++;
    System.out.println(x);

    }
    public static void main(String[]args){
        int x=25;
        try {
            
         run(x++);
        return;
        }
        finally{
            x++;
        }
    }

}
