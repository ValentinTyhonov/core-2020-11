public static void task3() {
        var scanner = new Scanner(System.in);
        System.out.println("Input password");
        var a = scanner.nextLine();
        switch (a) {
            case "pass123" -> {
                System.out.println("Successful log in!");
            }
            case "admin" -> {
                System.out.println("Successful log in! (admin mode)");
            }
            default -> {
                System.out.println("Wrong password");
            }
        }
    }