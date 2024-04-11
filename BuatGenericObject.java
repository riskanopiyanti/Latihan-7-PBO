MyData<String> myDataString = new MyData<String>(data: "Eko");
MyData<Integer> myDataInteger = new MyData<>(data: 100);
var myDataBoolean = new MyData<Boolean>(data: true);

System.out.println(myDataString.getData());
System.out.println(myDataInteger.getData());
System.out.println(myDataBoolean.getData());
