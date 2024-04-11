names.add("Eko");
names.add("Kurniawan");
names.addAll(Arrays.asList("Kurniawan", "Programmer", "Zaman", "Now"));

System.out.println(names.contains("Khannedy"));
System.out.println(names.containsAll(Arrays.asList("Eko", "Now")));

names.remove("Eko");
names.removeAll(Arrays.asList("Zaman", "Programmer"));

System.out.println(names.contains("Eko"));
System.out.println(names.containsAll(Arrays.asList("Eko", "Now")));
