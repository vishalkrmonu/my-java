class swapnum{
    public static  void swap(int x,int y){
        x=x+y;
        System.out.println(x);
        y=x-y;
        System.out.println(y);
        x=x-y;
        System.out.println(x+","+y);
    }
    public static void main(String[] args) {
        int x=8;
        int y=9;
        swap(x,y);
    }
}