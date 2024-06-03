class M{
    public void show(){
        int i;          // normal program
        for(i=0;i<=100;i++){
            System.out.println(i);
        }
    }
    public static void main(String[]args){
        M o1=new M();
        M o2=new M();
o1.show();
o2.show();

    }
}

class N{                // single thread(single task)
    public void show(){
        int i;
        for(i=0;i<=100;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);}
                catch(Exception ex){}
            }
        }
    
    public static void main(String[]args){
        N o1=new N();
        N o2=new N();
o1.show();
o2.show();

    }
}



class W extends Thread{         //multithread(multitasking)
    public void run(){
        int i;
        for(i=1;i<=100;i++){
            System.out.println(i);
            try{
            Thread.sleep(1000);}  
            
            catch(Exception ex){
            }
        }
    }
    public static void main(String[]args){
        W o1=new W();
        W o2=new W();
o1.start();
o2.start();

    }
}

/*create 3 thread
even,odd,divisible*/

class Even extends Thread{
    public void run(){
        int i;
        for(i=0;i<=100;i++){
            if(i%2==0){
                System.out.println("even "+i);}
                try{
                    Thread.sleep(1000);}     
                    catch(Exception ex){
                    }
            }}
        }
        class Odd extends Thread{
            public void run(){
                int i;
                for(i=0;i<=100;i++){
                    if(i%2!=0){
                        System.out.println("odd " +i);
                    }
                        try{
                            Thread.sleep(1000);}     
                            catch(Exception ex){
                            }
                    }} }

                    class Divisible extends Thread{
                        public void run(){
                            int i;
                            for(i=0;i<=100;i++){
                                if(i%3==0){
                                    System.out.println("divisible by 3 is  " +i);
                                }
                                }}
           public static void main(String[]args){
            Even e=new Even();
            Odd o=new Odd();
            Divisible d=new Divisible();
            e.start();
            o.start();;
            d.start();
           }
                            
                            }
            
    
