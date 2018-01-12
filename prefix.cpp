     #include<iostream.h>
  #include<string.h>

int GlobalCounter = 0;
int flag = 0;
int MatchString(char N[][10],int Input,int Min){
    int i = 0;
    if(GlobalCounter > Min)
        return 0;

    for(i = 0;i<Input-1;i++){
        if(N[i][GlobalCounter] == N[i+1][GlobalCounter])
            continue;
        else
            flag++;
    }
    if(!flag){
        flag = 0;
       printf("%c,N[i-1][GlobalCounter]);
        GlobalCounter++;
        return 1+MatchString(N,Input,Min);
    }
    else
        return 0;

}

    void main(){

    fflush(stdin);

    char N[10][10];

    int Input,Counter = 0,i,Min;
    scanf("%d%*c",&Input);

    while(Counter != Input){
        scanf("%s",N[Counter++]);
        fflush(stdin);
    }

    Min = strlen(N[0]);
    for(i = 0;i < Input;i++){
        if(Min >= strlen(N[i]))
            Min = strlen(N[i]);
    }

   MatchString(N,Input,Min);
}
