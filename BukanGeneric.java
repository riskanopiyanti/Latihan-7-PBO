Data dataString = new Data(); 
dataString.setData("Eko"); 
String value = (String) dataString.getData();

public static class Data { 

  private Object data; 

  public Object getData() { 
    return data; 
  } 
}
