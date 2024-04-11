Collection<String> names = new ArrayList<>();
names.add("Eko");
names.add("Kurniawan");
names.addAll(Arrays.asList("Kurniawan", "Programmer", "Zaman", "Now"));

names.remove(o: "Eko");
names.removeAll(Arrays.asList("Zaman", "Programmer"));

for (var name : names) {
  System.out.println(name);
}
