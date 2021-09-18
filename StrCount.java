public int strCount(String str, String sub) {
  if(str.length() < sub.length()) {
    return 0;
  }
  if(str.substring(0, sub.length()).equals(sub)) {
    return 1 + strCount(str.substring(sub.length(), str.length()), sub);
  }
  return 0 + strCount(str.substring(1, str.length()), sub);
}
