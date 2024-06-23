# Single responsibility
- Look at package single_responsibility
- the controller don't handle any business logic. It's belong to service classes
# Open close
- Software entity must open for extension but must be closed
for modification
> explain: for example class DMSDocument can extend to any document of any provider (NScale, sharepoint),
you can modification each method after you extend without effect to other 
Document provider
# Liskov Substitution