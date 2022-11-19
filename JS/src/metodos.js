export function filtarPorAnoERetornarNome(series, ano) {
  const arrayNomeSeries = series.filter(serie => {
    return serie.anoEstreia >= ano
  }).map(nomesSerie => {
    return nomesSerie.titulo
  })

  return arrayNomeSeries;
}

export function verificarSeAtorEstaEmSeriado(series, nomeAtor) {
  const estaEmElenco = series.find(serie => {
    return serie.elenco.find(ator => {
      return ator == nomeAtor;
    })
  })

  if (!estaEmElenco) {
    return false;
  }
  return estaEmElenco.elenco.includes(nomeAtor);
}

export function calcularMediaTotalDeEpisodios(series) {
  const totalSeries = series.length;
  const totalEpisodios = series.reduce((acc, serie) => {
    acc = acc + serie.numeroEpisodios;
    return acc;
  }, 0)
  return totalEpisodios / totalSeries;
}

export function agruparTituloDasSeriesPorPropriedade(series, propriedade) {
  const distribuidoras = series.filter(serie => {
    return serie.distribuidora == propriedade;
  })
  const grupoDistribuidoras = {
    ...distribuidoras.map(serie => {
      return serie.titulo
    })
  }

  return grupoDistribuidoras;
}

