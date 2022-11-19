import filmes from '../filmes.json';
import { filtarPorAnoERetornarNome, verificarSeAtorEstaEmSeriado, agruparTituloDasSeriesPorPropriedade, calcularMediaTotalDeEpisodios } from '../src/metodos.js';

it('Deve filtrar as series com ano de estreia maior ou igual a 2010 e retornar uma listagem com os nomes', () => {

  const valorAtual = filtarPorAnoERetornarNome(filmes, 2010);
  const valorEsperado = ["Stranger Things", "Game Of Thrones", "The Walking Dead", "Band of Brothers", "Gus and Will The Masters of the Wizards", "10 Days Why", "Mr. Robot", "Narcos", "Westworld"];

  expect(valorAtual).toEqual(valorEsperado);
})

it('Deve retornar true ao procurar ator que está em elenco', () => {
  const valorAtual = verificarSeAtorEstaEmSeriado(filmes, 'Bryan Cranston');
  const valorEsperado = true;

  expect(valorAtual).toBe(valorEsperado);
})


it('Deve retornar false ao procurar ator que não participa de elenco', () => {
  const valorAtual = verificarSeAtorEstaEmSeriado(filmes, 'michael jackson');
  const valorEsperado = false;

  expect(valorAtual).toBe(valorEsperado);
})



it('Deve calcular corretamente a media total de episódios de todas as series', () => {
  const valorAtual = calcularMediaTotalDeEpisodios(filmes);
  const valorEsperado = 35.8;

  expect(valorAtual).toBe(valorEsperado);
})


it('Deve agrupar corretamente em um objeto os titulos das series baseado na Distribuidora', () => {
  const valorAtual = agruparTituloDasSeriesPorPropriedade(filmes, 'Netflix');
  const valorEsperado = { '0': 'Stranger Things', '1': 'Narcos' };

  expect(valorAtual).toEqual(valorEsperado);
})
