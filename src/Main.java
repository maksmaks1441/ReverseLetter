public class Main {
    public static String reverseLetter(String input){

        if (input == null || input.isEmpty()){
            return input;
        }
        char [] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right){
            if (!Character.isLetter(chars[left])){
                left++;
            }
            else if (!Character.isLetter(chars[right])){
                right--;
            }
            else {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
        return new String(chars);

    }

    public static void main(String[] args) {
        System.out.println(reverseLetter("J@va the be$t!123"));
    }
}