public static void task5() {
        var scann = new Scanner(System.in);
        System.out.println("Input m");
        var m = scann.nextInt();
        System.out.println("Input n");
        var n = scann.nextInt();
        var ten = 10;
        if (Math.abs(ten- n) > Math.abs(ten - m)){
            System.out.println(m+" - is closer to 10");
        }
        else if (ten - n == ten - m){
            System.out.println(n+" and "+n+ " equally close to 10");
        }else{
            System.out.println(n+" - is closer to 10");
        }
    }