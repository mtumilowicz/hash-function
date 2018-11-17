[![Build Status](https://travis-ci.com/mtumilowicz/hash-function.svg?branch=master)](https://travis-ci.com/mtumilowicz/hash-function)
# hash-function
The main goal of this project is to provide simple example of hash function 
and basic description.

# definition
**Hash function** is any function that can be used to map data of arbitrary 
size to data of a fixed size.

# contract
* **Determinism** - for a given input value it must always generate the same hash 
value. In other words, it must be a function of the data to be hashed, in the 
mathematical sense of the term.

  _Remark_: Python hash functions could make use of a randomized seed that is 
  generated once when the Python process starts in addition to the input to be 
  hashed. The Python hash is still a valid hash function when used within a 
  single run.

* **Uniformity** - every hash value in the output range should be generated 
with roughly the same probability.

  _Remark_: the cost of hashing-based methods goes up sharply as the number 
  of collisions increases.
  
  _Remark_: `birthday paradox` shows that a small number of collisions is 
  virtually inevitable: in probability theory, the birthday problem or 
  birthday paradox concerns the probability that, in a set of n randomly 
  chosen people, some pair of them will have the same birthday. However, 
  99.9% probability is reached with just 70 people, and 50% probability 
  with 23 people. For more info please refer my other github project:
  https://github.com/mtumilowicz/java11-birthday-paradox
  
  _Remark_: The uniformity of the distribution of hash values can be evaluated 
  by the `chi-squared test`.

* **Defined range** - it is often desirable that the output of a hash function 
have fixed size - such hashing is commonly used to accelerate data searches.

* **Non-invertible** - in cryptographic applications, hash functions are 
typically expected to be practically non-invertible.

# description
The value `31` was chosen because it is an odd prime. If it were even and the 
multiplication overflowed, information would be lost, as multiplication by `2` 
is equivalent to shifting. A nice property of `31` is that the multiplication can 
be replaced by a shift and a subtraction for better performance:  `31 * i == (i << 5) - 1`.  
The advantage of using a prime is quite clear.
