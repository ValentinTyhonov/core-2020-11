public static void task1(){
        var scann = new Scanner(System.in);
        System.out.println("Input a");
        var a = scann.nextInt();
        System.out.println("Input b");
        var b = scann.nextInt();
        System.out.println("Input c");
        var c = scann.nextInt();
        var d = Math.pow(b,2)-4*a*c;
        System.out.println(D);
        if (d > 0){
            var x1 = (-b+Math.sqrt(d))/2*a;
            var x2 = (-b-Math.sqrt(d))/2*a;
            System.out.println("X1 = " + x1 + " X2 = " + x2);
        }
        else if (d == 0){
            var x = (-b+Math.sqrt(d))/2*a;
            System.out.println("X = " + x);
        }
        else{
            System.out.println("Немає дійсних коренів");
        }
    }