public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[10];
    data = d;
    start = 0;
    end = 0;
    size = 0;
  }



  public MyDeque(int initialCapacity){
    if(initialCapacity < 1){
      throw new IllegalArgumentException();
    }
    @SuppressWarnings("unchecked")
    E[] d = (E[])new Object[initialCapacity];
    data = d;
  }

  public int size(){
    return size;
  }




  public String toString(){
    String ans = "{";
    for(int i = 0;i < size;i++){
      ans = ans + data[i] + " ";
    }
    return ans + "}";
  }
  public void addFirst(E element){
    if(size == data.length){
      resize();
    }
    if(end < start){
      if(end + 1 == start){

      }

    }
  }
  public void addLast(E element){ }
  public E removeFirst(){ }
  public E removeLast(){ }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }

  public void resize(){
    E[] new = (E[]) new Object[data.length * 2];
    for(int i = 0; i < data.length;i++){
      new[i]= data[i];
    }
    data = new;
  }

}
