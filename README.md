# PokemonGoEvolutionCPCalc
This program gives a range your evolved Pokemon's CP will be after evolving it.

![Image of GUI](http://imgur.com/bbYt4sT.png)
![Image2 of GUI](http://imgur.com/dnJxYtd.png)

# Evolution Calculation
```
function( currentCP, currentHP, stardust) {
    List validPostEvolutionCPs
    for (all level ranges [0, 79] or based on stardust) {
        calculate CpMultiplier
        for (all stamina ranges [0, 15]) {
            calculate HP
            if (HP == currentHP) {
                for (all attack ranges [0, 15]) {
                    for (all defence ranges [0, 15]) {
                        calculate CP
                        if (CP == currentCP) {
                            calculate postCP
                            add postCP to validPostEvolutionCPs
                        }
                    }
                }
           }
        }
    }
    use validPostEvolutionCPs to get min/average/max CP
}
```
