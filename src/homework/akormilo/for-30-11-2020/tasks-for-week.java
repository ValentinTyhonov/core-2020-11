public static void task2() {
        var scanner = new Scanner(System.in);
        System.out.println("Input day");
        var a = scanner.nextLine();
        switch (a) {
            case "Monday" -> {
                System.out.println("1. Work\n2. Homework\n");
            }
            case "Tuesday" -> {
                System.out.println("1. Rest\n2. Cooking");
            }
            case "Wednesday" -> {
                System.out.println("1. Work\n2. Homework");
            }
            case "Thursday" -> {
                System.out.println("1. Learning\n2. Rest");
            }
            case "Friday" -> {
                System.out.println("1. Nothing");
            }
            case "Saturday" -> {
                System.out.println("1. Work\n2. Homework 3. Rest");
            }
            case "Sunday" -> {
                System.out.println("1. Rest (Sunday, ofc :/ )");
            }
            default -> {
                System.out.println("Not found");
            }
        }
    }