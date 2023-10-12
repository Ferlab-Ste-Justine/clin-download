package bio.ferlab.ferload.model.drs

/**
 * @param name A name declared by the bundle author that must be used when materialising this object, overriding any name directly associated with the object itself. The name must be unique within the containing bundle. This string is made up of uppercase and lowercase letters, decimal digits, hyphen, period, and underscore [A-Za-z0-9.-_]. See http://pubs.opengroup.org/onlinepubs/9699919799/basedefs/V1_chap03.html#tag_03_282[portable filenames].
 * @param id A DRS identifier of a `DrsObject` (either a single blob or a nested bundle). If this ContentsObject is an object within a nested bundle, then the id is optional. Otherwise, the id is required.
 * @param drs_uri A list of full DRS identifier URI paths that may be used to obtain the object. These URIs may be external to this DRS instance. for example: ''drs://drs.example.org/314159''
 */
case class ContentsObject (
  name: String,
  id: Option[String],
  drs_uri: Option[List[String]]
)

