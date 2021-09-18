public boolean strCopies(String str, String sub, int n) {
  if(str.length() < sub.length()) {
    return n<1 ? true : false;
  }
  if(str.substring(0, sub.length()).equals(sub)) {
    n--;
    return  strCopies(str.substring(1, str.length()), sub, n);
  }
  
  return strCopies(str.substring(1, str.length()), sub, n);
}
