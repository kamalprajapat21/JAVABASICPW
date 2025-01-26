class Demo {
    public static void main(String[] args) {
        //All are valid Sysntex
    //  static public void main(String ... args){
    // public static void main(String[] args) {
        System.out.println("hello kamal Prajapat");
        System.out.println(args[0]);
        System.out.println(args[1]);
        int _name = 11; //Valid (Only _ , $ are Valid Special Symbole)
        int $age = 45; //Valid
        int &age = 10; //invalid 
        int @age3 = 100;
        System.out.println(_name);
        System.out.println($age);
        System.out.println(@age3);
    }
}

// ////
// java Demo kamal kumar
// hello kamal Prajapat
// kamal
// kumar
// PS D:\7thsem\Skills\NotepadJava> ///