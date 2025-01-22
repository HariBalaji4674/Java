## Arithmetic Operators

* **Addition:** +
* **Subtraction:** -
* **Multiplication:** *
* **Division:** / (returns quotient)
* **Modulo:** % (returns remainder)

## Relational / Comparison Operators

* **Greater than:** >
* **Less than:** <
* **Greater than or equal to:** >=
* **Less than or equal to:** <=
* **Not equal to:** !=
* **Equal to:** ==

* **Returns:** Always a Boolean value (True or False)

## Logical Operators

* **And:** `and` or `&&`
    * Requires both operands to be `True` to return `True`.
* **Or:** `or` or `||`
    * Requires at least one operand to be `True` to return `True`.
* **Not:** `not` or `!`
    * Reverses the boolean value of the operand.

* **Note:**
    * Logical operators work only with Boolean operands.
    * They always return a Boolean value.

## Assignment Operators

* **Increment:** `++`
    * **Post-increment:** `a++` (assigns the value of `a` first, then increments `a`)
    * **Pre-increment:** `++a` (increments `a` first, then assigns the new value)
* **Decrement:** `--`
    * **Post-decrement:** `a--` (assigns the value of `a` first, then decrements `a`)
    * **Pre-decrement:** `--a` (decrements `a` first, then assigns the new value)

* **Examples:**
    * `res = a++` (assigns the current value of `a` to `res`, then increments `a`)
    * `res = ++a` (increments `a` first, then assigns the new value of `a` to `res`)

## Compound Assignment Operators

* **Addition assignment:** `a += 1` (equivalent to `a = a + 1`)
* **Subtraction assignment:** `a -= 1` (equivalent to `a = a - 1`)
* **Division assignment:** `a /= 1` (equivalent to `a = a / 1`)
* **Multiplication assignment:** `a *= 2` (equivalent to `a = a * 2`)
* **Modulo assignment:** `a %= 2` (equivalent to `a = a % 2`)

* **Note:** Compound assignment operators work only with numerical values.

## Ternary Operator

* **Syntax:** `variable = expression ? result1 : result2`

* **Example:**
    ```
    num = (num > 10) ? True : False 
    ```
  If `num` is greater than 10, `num` will be assigned the value `True`. Otherwise, it will be assigned the value `False`.
* ***All These are divided into two categories***
  * Unary Operator (Can operate with single variable)
  * Binary Operators (Can operate with double variable)
  * Ternary Operator 