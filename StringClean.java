public String stringClean(String str) {
  if(str.length()<=1) {
    return str;
  }
  if(str.substring(0,1).equals(str.substring(1,2))) {
    return stringClean(str.substring(1, str.length()));
  }
  return str.substring(0,1) + stringClean(str.substring(1, str.length()));
}
