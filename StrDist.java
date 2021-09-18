public int strDist(String str, String sub) {
  if(str.startsWith(sub) && str.endsWith(sub) || str.length() <1) {
    return str.length();
  }
  if(str.endsWith(sub)) {
    return strDist(str.substring(1), sub);
  }
  return strDist(str.substring(0, str.length()-1), sub);
}
