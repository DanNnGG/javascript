var num = [5,8,2,9,3] //classes criadas para o [num]

num[5] = 6 //por um número escolhido na ordem selecionada

num.push(7) //por um número escolhido no final

num.sort() //por em ordem crescente

console.log(`${num}`)
console.log(`O número dessa posição é o ${num[2]}`)
console.log(`Nosso vetor tem ${num.length} posições`) //num.length é para ver quantas posições tem

//`${num[0]} é para ver o número atribuido na posição

//var pos = num.indexOf(3) //encontrar a posição
// console.log(`Está na posição ${pos}`)

//se não encontar o número na posição, ele fica como -1

var pos = num.indexOf(1)
if(pos == -1){
    console.log('Posição não encontrada')
}else{
    console.log(`Está na posição ${pos}`)
}


