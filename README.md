# bls : Balanced Latin Squares

A Latin square[1] is an *n x n* array filled with *n* different symbols, each occuring exactly once in each row and column.

Latin squares are often used in experiment designs; each row corresponds to a participant, and each column corresponds to a condition.
In order to control for the ordering of the conditions, experiments can use a Balanced Latin Square[2].

When the number of conditions is even, each condition will precede another once.
When the number of conditions is odd, each condition will precede another twice.

## Installation

Assuming you have installed [git](https://git-scm.com) and [leiningen](https://leiningen.org) :

```
    $ git clone https://github.com/jbgreer/bls.git`
    $ lein uberjar
```

## Usage

    `$ java -jar bls-0.1.0-standalone.jar <n>`

where *n* represents the number of conditions.

### Bugs

None found so far.  Will you be the first?

### Citations

[1] Wikipedia contributors. (2023, July 27). Latin square. In _Wikipedia, The Free Encyclopedia._ Retrieved 14:38, August 13, 2023, from `https://en.wikipedia.org/w/index.php?title=Latin_square&oldid=1167384530`

[2] James V Bradley. (1958).  Complete Counterbalancing of Immediate Sequential Effects in a Latin Square Design.  _Journal of the American Statistical Association, 53:282, 525-528_, `DOI: 10.1080/01621459.1958.10501456`

## License

Copyright © 2023 James B. Greer

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.