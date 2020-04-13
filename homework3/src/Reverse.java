public class Reverse {

    private String input;

    public Reverse(String in){
        input = in;
    }

    public void rev(){
        int size = input.length();
        Stack st = new Stack(size);

        for (int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            st.push(ch);
        }
        String outPut="";
        for (int i=0; i<input.length(); i++){
            outPut+=st.pop();
        }
        input=outPut;
        if (!st.isEmpty()){
            System.out.println("Error: missing right delimiter");
        }
    }
    public String outPut(){
        return(input);
    }

}
