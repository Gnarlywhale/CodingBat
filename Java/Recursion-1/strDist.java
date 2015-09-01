
// Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
// http://codingbat.com/prob/p195413

public int strDist(String str, String sub) {
  if(str.length()<sub.length()) return 0;
  if(str.startsWith(sub) && str.substring(str.length()-sub.length(),str.length()).equals(sub)) return str.length();
  int right = strDist(str.substring(0,str.length()-1), sub);
  int left = strDist(str.substring(1,str.length()),sub);
  return Math.max(right,left);
}
