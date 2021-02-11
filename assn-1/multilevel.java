    class multilevel {
    static class classA{
        final int fint=10;
        int classC=100;
        classA(){
            System.out.println("Constructor loaded for classA");
        }   
    }

    static class classB extends classA{
        String title="class classB extending classA";
        classB(){
            System.out.println("Constructor loaded for classB");
        } 
        void showTitle(){
            System.out.println("Title for parent class using super method: "+title+"\n");
        }
    }

    //final makes the classC class non inheritable
    final static class classC extends classB{
        String title="class classC extending classB";

        //the integer variable with final keyword , fint (here), throws error when tried to change
        final int fint=100;
        classC(){
            System.out.println("Constructor loaded for classC\n");
        }

        void showTitle(){
            System.out.println("Title for classC : "+title);// without super
            super.showTitle(); //super method of base class used
        }

        void introduce()
        {
            System.out.println("$ Multilevel inheritance of class classC, classB and classA is shown in this example $\n");
        }

        void tryfinal()
        {
            fint=400;
        }
    }
    public static void main(String args[]){
        classC obj=new classC();
        obj.introduce();
        obj.showTitle();
        System.out.println("## Trying to change integer with final keyword , we get this error below :\n");
        obj.tryfinal();
    }
}
