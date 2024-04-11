Iterable<String> names = List.of("Eko", "Kurniawan", "Khannedy");
Iterator<String> iterator = names.iterator();

while (iterator.hasNext()) {
  String name = iterator.next();
  System.out.println(name);
}
