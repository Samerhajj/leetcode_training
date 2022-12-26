#include <stdio.h>
#include <stdlib.h>


double calc_red_drop_prob(double min_threshold, double max_threshold, double avg_length, double max_p, int count) {
double temp_p = max_p * (avg_length - min_threshold) / (max_threshold - min_threshold);
 if (max_threshold <= min_threshold) {
    fprintf(stderr, "Error: max_length must be greater than min_length.\n");
    return -1;
  }

double p = temp_p / (1 - (count * temp_p));
printf("P: %f\n", p);
return p;
}

int main() {
	printf("Count \t  P \n");
double min_threshold = 20;
double max_threshold = 40;
double avg_length = 35;
double max_p = 0.04;
int i=0;
while (1)
{
	printf("%d  ",i);
	double p = calc_red_drop_prob(min_threshold, max_threshold, avg_length, max_p, i);
	if(p>=1){
		break;
	}
	i++;
}

return 0;
}