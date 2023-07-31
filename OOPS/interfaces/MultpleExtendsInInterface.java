package OOPS.interfaces;

//In java for normal classes we cannot extend multiple classes at a time, so there is no multiple inheritance
// it is possible in interface
interface UserOne{

}
interface UserTwo{

}
interface UserThree{

}
public interface MultpleExtendsInInterface extends UserOne,UserTwo,UserThree{
}
