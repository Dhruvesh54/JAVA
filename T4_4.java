//4.Write a java program that takes numbers from the user using command line argument and display the maximum number amongst them.
class T4_4 {
    public static void main(String[] args) {
        int args0 = Integer.parseInt(args[0]);
        if (args.length == 0 || args.length == 1) {
            System.out.println("please Enter more than one digits");
        } else {
            for (int i = 0; i < args.length; i++) {
                int argsi = Integer.parseInt(args[i]);
                if (args0 < argsi) {
                    args0 = argsi;
                }
            }
            System.out.println("Maximum number is : " + args0);
        }
    }

}