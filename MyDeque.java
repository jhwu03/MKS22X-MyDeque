import java.util.*;
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
    start = 0;
    end = 0;
    size = 0;
  }

  public int size(){
    return size;
  }

  public String toString(){
    if(size == 0){
      return "{}";
    }
    String ans = "{";
    int starting = start;
    if( start <= end){
      while(starting <= end){
        ans += data[starting] + " ";
        starting++;
      }
    }else{
      while(starting != end + 1){
        ans += data[starting] + " ";
        if(starting == data.length - 1){
          starting = 0;
        }else{
          starting++;
        }
      }
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
    if(size != 0){
    if(size == data.length){
      resize();
      start = 0;
      end = size;
    }else if(end == data.length - 1){
      end = 0;
    }else{
      if (size != 0){
        end++; 
      }
    }
  }
    size++;
    data[end] = element;
  }

  public E removeFirst(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E removed = data[start];
    data[start] = null;
    if( start != data.length - 1){
      start++;
    }else{
      start = 0;
    }
    size--;
    if(size == 0){
      start = 0;
      end = 0;
    }
    return removed;
  }

  public E removeLast(){
    if (size == 0){
      throw new NoSuchElementException();
    }
    E removed = data[end];
    data[end] = null;
    if(end != 0){
      end--;
    }else{
      end = data.length - 1;
    }
    size--;
    if(size == 0){
      start = 0;
      end = 0;
    }
    return removed;
  }

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
