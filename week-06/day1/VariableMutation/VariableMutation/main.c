#include <stdio.h>

int main(int argc, const char * argv[]) {
    int a = 3;
    // make it bigger by 10
    a += 10;
    printf("%d\n", a);
    
    
    int b = 100;
    // make it smaller by 7
    b -= 7;
    printf("%d\n", b);
    
    
    int c = 44;
    // please double c's value
    c *= 2;
    printf("%d\n", c);
    
    
    int d = 125;
    // please divide by 5 d's value
    d /= 5;
    printf("%d\n", d);
    
    
    int e = 8;
    // please cube of e's value
    e *= e * 2;
    printf("%d\n", e);
    
    
    int f1 = 123;
    int f2 = 345;
    // tell if f1 is bigger than f2 (print as a boolean)
    printf("%d\n", f1 > f2);
    
    
    int g1 = 350;
    int g2 = 200;
    // tell if the double of g2 is bigger than g1 (print as a boolean)
    printf("%d\n", g2*2 > g1);
    
    int h = 1357988018575474;
    // tell if it has 11 as a divisor (print as a boolean)
    printf("%d\n", h % 11 == 0);
    
    
    int i1 = 10;
    int i2 = 3;
    // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
    printf("%d\n", i1 > i2*i2 && i1 < i2*i2*i2);
    
    
    int j = 1521;
    // tell if j is dividable by 3 or 5 (print as a boolean)
    printf("%d\n", j % 3 == 0 || j % 5 == 0);
    
}
