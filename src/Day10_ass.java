public class Day10_ass{
    static void main(){
    String name=null;
    try{
            System.out.println(name.charAt(3));
            System.out.println(16 / 0);
    } catch (NullPointerException e) {
        System.out.println("Null Pointer Exception");
    }catch (ArithmeticException e) {
        System.out.println("Arithmetic Exception");
    } catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array Index Out Of Bound Exception");
    }finally{
        System.out.println("Executed Successfully");
    }
    }
}
