#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void frequency(char *str,int len){
  int alpha[26]={0};
  for(int i=0;i<len;i++){
    alpha[str[i]-'a']++;
  }
  for(int i=0;i<26;i++){
    if(alpha[i]>0){
      printf("%c : %d\n",i+'a',alpha[i]);
    }
  }
  
}

int main(void) {
  char *str;
  str=(char *)malloc(30*sizeof(char));
  scanf("%s",str);
  int len=strlen(str);
  frequency(str,len);
  return 0;
}
