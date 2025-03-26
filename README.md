flowchart TD
    A[Início: Colaborador identifica necessidade de férias] --> B[Preenche solicitação (formulário/sistema)]
    B --> C[Envia solicitação para o Gestor]
    C --> D{Gestor avalia a solicitação?}
    D -- Não --> E[Retorna ao colaborador com feedback]
    D -- Sim --> F[Envia solicitação ao RH]
    F --> G[RH avalia a solicitação]
    G --> H[Verifica conformidade e disponibilidade]
    H --> I[Comunica aprovação e confirma datas]
    I --> J[Fim: Registro no sistema]
