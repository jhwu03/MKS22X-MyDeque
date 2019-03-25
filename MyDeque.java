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
    if(element == null){
      throw new NullPointerException();
    }
    if(size != 0){
    if(size == data.length){
      resize();
      start = data.length-1;
      end = size - 1;
    }else if(start == 0){
        start = data.length - 1;
      }else{
        start--;
      }
    }
    size++;
    data[start] = element;

  }
  public void addLast(E element){
    if (element == null){
      throw new NullPointerException();
    }
    if(size == data.length){
      resize();
      start = 0;
      end = size;
    }else if(end == data.length - 1){
      end = 0;
    }else{
      if (size != 0){
        end++; //if we're just adding for the first time, then end should not increment away from start
      }
    }
    size++;
    data[end] = element;
  }
  public E removeFirst(){ }
  public E removeLast(){ }

  public E getFirst(){
    return data[start];
  }

  public E getLast(){
    return data[end];
  }

  public void resize(){
    @SuppressWarnings("unchecked")
    E[] newA = (E[])new Object[data.length * 2 + 1];
    int s = start;
    for(int i = 0; i < data.length;i++){
      newA[i]= data[s];
      if( s == data. length - 1){
        s = 0;
      }else{
        s++;
      }
    }
    data = newA;
  }

}
