class Start {
    public static void main(String[] data) throws Exception {
        char current = 'S';
        char next = '?';
        String buffer = "";
        
        while(current != 'X') {
            int k = System.in.read();
            if (k < 0) {
                next = 'X';
                break;
            }
            char c = (char)k;
            
            if (current == 'S' && c == '<') {
                buffer = buffer.trim();
                if (buffer.length() > 0) {
                    System.out.println(buffer);
                }
                buffer = "<";
                next = 'T';
            }
            if (current == 'S' && c != '<' && k >= 0) {
                buffer = buffer + c;
            }
            if (current == 'S' && c == '>') {
                buffer += ">";
                System.out.println(buffer.trim());
                buffer = "";
                next = 'S';
            }
            if (current == 'S' && c != '>' && k >= 0) {
                buffer += c;
            }
            current = next;
        }
    }
}