# Exceptions in Java

## Why Exceptions?

Consider the situation where one is search for a value in an array:

```java
    /**
     * Find the index of a student in the class list using the student number.
     * @param studentNumber is the student number of the student to find.
     * @return the index in the class list that corresponds to the given student number or -1 if the student number is not found.
     */
    private int findIndex(int studentNumber) throws NotFoundException {
        for (int i = 0; i < classList.length; i++) {
            if (classList[i] == studentNumber) {
                return i;
            }
        }
        return -1;
    }
```

We have used the idiom of return -1 (a special value) when we cannot find a student number is an array. This method has a clear specification but that does not eliminate the possibility of mistakes like this:

```java
    /**
     * Find the grade of a student using the student number
     *
     * @param studentNumber is the student number for the student whose grade has been requested
     * @return the grade of the student with the provided student number
     */
    public int getGrade(int studentNumber) {
        int index;
        index = findIndex(studentNumber);
        return classGrades[index];
    }
```

The implementation of `getGrade` does not handle the case when the value returned by `findIndex` is -1 and this could lead to an array-out-of-bounds exception, which is Java's mechanism for signalling a problem.

Can we make it harder, for someone implementing a method like `getGrade`,  to ignore the possibility that we may not find a value in an array? We can if we use exceptions.

Exceptions can signal certain special situations and problems and ensure that these are considered.

## Using Exceptions in Java

We use a few different examples to illustrate the use of Exceptions:

*   The package `exceptions1` does not use exceptions.
*   The package `exceptions2` uses exceptions and handles the exception as soon as possible.
*   The package `exceptions3` handles the exception in `main`.
*   The package `exceptions4` declares `main` as throwing the `NotFoundException` and takes no other action.

Of these four variations, the version in `exceptions2` is likely the best choice but these examples are there to illustrate the syntax associated with exceptions in Java.

In addition to the discussion around `findIndex`, notice that the constructor for `CourseGrades` should also throw an exception. Which exception is best suited to this constructor? Make the changes yourself.

## Video

You can find an associate video on Vimeo: https://vimeo.com/461659972/38c97d4605