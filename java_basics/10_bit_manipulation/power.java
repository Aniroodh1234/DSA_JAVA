// modulo arithmetics
// mod value is slpitted between the operands




// euclidean GCD algo followed fermat little algo 
// then etebded euclidean algo to perform the 
// inverse modulo on dividon condition

// 2 digits
// (a + b) % m = (a%m + b%m) % m
// (a - b) % m = (a%m - b%m + m) % m
// (a * b) % m = (a%m * b%m) % m
// (a / b) % m = a * inv(b) % m

// 3 digits
// (a+b+c)%m = (a%m+b%m+c%m)%m
// (a-b-c)%m = (a%m-b%m-c%m+2m)%m
// (a*b*c)%m = ((a%m*b%m)%m*c%m)%m
// (a/b/c)%m = a*inv(b)*inv(c)%m   (if inverses exist)