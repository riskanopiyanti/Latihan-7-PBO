Data<String> dataString = new Data<String>();
dataString.setData("Eko");
String value = dataString.getData();

public static class Data<T> {
 private T data;
 public T getData() {
 return data;
 }
}
